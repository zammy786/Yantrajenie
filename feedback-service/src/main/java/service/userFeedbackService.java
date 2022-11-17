package service;

import io.grpc.stub.StreamObserver;
import org.example.FeedBackGrpc;
import org.example.UserFeedback;

import java.sql.*;
// service class which contains all the overridden method.
public class userFeedbackService extends FeedBackGrpc.FeedBackImplBase {
    //method for feedback which takes the feedback of user and saves the data into database
    public void feedback(UserFeedback.feedbackMessage request, StreamObserver<UserFeedback.feedbackResponse> responseObserver) {
        //setting up the requests which are defined in the protofile
        String uid = request.getUid();
        String username = request.getUname();
        String feedback = request.getFeed();
        String spid = request.getSpid();
        int rating = request.getRating();
        if (ChannelUser.validateUser(uid) && ChannelSP.validateUser(spid)) {
            //setting up the response for showing the response accordingly
            UserFeedback.feedbackResponse.Builder response = UserFeedback.feedbackResponse.newBuilder();
                //Starting the jdbc connection for database operations.
                String url = "jdbc:postgresql://localhost:5432/feedback_service";
                String uname = "postgres";
                String pass = "test123";
                try {
                    Class.forName("org.postgresql.Driver");
                    Connection connection = DriverManager.getConnection(url, uname, pass);
                    System.out.println("connection established");
                    String query = "insert into feedback_details  values(default,?,?,?,?,?)";
                    PreparedStatement stmt = connection.prepareStatement(query);

                    if (username.isEmpty()) {
                        response.setRespMsg("username is empty");
                        response.setRespCode(400);
                    } else if (uid.isEmpty()) {
                        response.setRespMsg("userid is empty");
                        response.setRespCode(400);

                    } else if (!uid.matches("[0-9]+")) {
                        response.setRespMsg("user id is incorrect");
                        response.setRespCode(400);
                    } else if (!username.matches("^[A-Za-z]+$")) {
                        response.setRespMsg("username is incorrect");
                        response.setRespCode(400);
                    } else if (spid.isEmpty()) {
                        response.setRespMsg("service provider id is incorrect");
                        response.setRespCode(400);
                    } else if (feedback.isEmpty()) {
                        response.setRespMsg("feedback is empty");
                        response.setRespCode(400);
                    } else {
                        stmt.setInt(1, Integer.parseInt(uid));
                        stmt.setString(2, username);
                        stmt.setString(3, feedback);
                        stmt.setInt(4, rating);
                        stmt.setInt(5, Integer.parseInt(spid));
                        stmt.executeUpdate();
                        response.setRespMsg("success");
                        response.setRespCode(200);
                        responseObserver.onNext(response.build());
                        responseObserver.onCompleted();
                    }
                    //generating the response of feedback_id from the database.
                    String query2 = "select feed_id from feedback_Details order by feed_id desc;";
                    PreparedStatement stmt2 = connection.prepareStatement(query2);
                    ResultSet rs = stmt2.executeQuery();
                    if (rs.next()) {
                        response.setFeedId(rs.getInt(1));
                    }
                    System.out.println(rs.getInt(1));

                    //exception handling for sql exceptions.
                } catch (SQLException | ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else{
                UserFeedback.feedbackResponse.Builder response = UserFeedback.feedbackResponse.newBuilder();
                response.setRespMsg("not a valid user");
                response.setRespCode(400);
                response.setFeedId(0);
                responseObserver.onNext(response.build());
                responseObserver.onCompleted();
            }


    }

    @Override
    public void deleteFeedback(UserFeedback.rmvFeedback request, StreamObserver<UserFeedback.feedbackResponse> responseObserver) {
        int feedId = request.getFeedid();
        UserFeedback.feedbackResponse.Builder response = UserFeedback.feedbackResponse.newBuilder();

        String url = "jdbc:postgresql://localhost:5432/feedback_service";
        String uname = "postgres";
        String pass = "test123";
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, uname, pass);
            System.out.println("connection established");
            String query = "delete from public.feedback_details where feed_id= ?;";
            PreparedStatement stmt = connection.prepareStatement(query);
            String query2 = "select * from feedback_Details where feed_id=?;";
            PreparedStatement stmt2 = connection.prepareStatement(query2);
            stmt2.setInt(1,feedId);
            ResultSet rs = stmt2.executeQuery();
            int n=0;
            if(rs.next()){
                n=rs.getInt(1);
            }
            if(n>0 ){

                response.setFeedId(request.getFeedid());
                response.setRespMsg("success!!!");
                response.setRespCode(200);

            } else if (feedId==0) {
                response.setRespMsg("feedback id incorrect");
                response.setRespCode(400);

            } else {
                response.setRespMsg("feedback id not present");
                response.setRespCode(400);
            }
            stmt.setInt(1, request.getFeedid());
            stmt.executeUpdate();
            response.setFeedId(request.getFeedid());
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void editFeedback(UserFeedback.editF request, StreamObserver<UserFeedback.feedbackResponse> responseObserver) {
//        super.editFeedback(request, responseObserver);
        String msg = request.getNewMsg();
        int fid = request.getFeedid();
        int rating=request.getRating();
        UserFeedback.feedbackResponse.Builder response = UserFeedback.feedbackResponse.newBuilder();
        if (!msg.isEmpty()) {
            response.setRespMsg("Success!!!!");
            response.setRespCode(200);
        } else {
            response.setRespMsg("Failure!!!");
            response.setRespCode(400);
        }


        String url = "jdbc:postgresql://localhost:5432/feedback_service";
        String uname = "postgres";
        String pass = "test123";
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, uname, pass);
            System.out.println("connection established");
            String query = "update public.feedback_details set feedback=? , rating=? where feed_id= ?;";
            PreparedStatement stmt = connection.prepareStatement(query);
            String query2 = "select * from feedback_Details where feed_id=?;";
            PreparedStatement stmt2 = connection.prepareStatement(query2);
            stmt2.setInt(1,fid);
            ResultSet rs = stmt2.executeQuery();
            int n=0;
            if(rs.next()){
                n=rs.getInt(1);
            }
            if(n>0 ){

                response.setFeedId(request.getFeedid());
                response.setRespMsg("success!!!");
                response.setRespCode(200);

            } else if (fid==0) {
                response.setRespMsg("feedback id incorrect");
                response.setRespCode(400);

            } else {
                response.setRespMsg("feedback id not present");
                response.setRespCode(400);
            }
            stmt.setString(1, request.getNewMsg());
            stmt.setInt(2,request.getRating());
            stmt.setInt(3, request.getFeedid());


            if (!msg.isEmpty()) {
                stmt.executeUpdate();
            } else {
                System.out.println("update msg cannot be empty!!");
                response.setRespMsg("feedback message is empty");
            }
            response.setFeedId(request.getFeedid());
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void getById(UserFeedback.commonID request, StreamObserver<UserFeedback.GetByUidResp> responseObserver) {
//        super.getById(request, responseObserver);
        String uid = request.getUid();
        String url = "jdbc:postgresql://localhost:5432/feedback_service";
        String uname = "postgres";
        String pass = "test123";
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, uname, pass);
            System.out.println("connection established");
            UserFeedback.GetByUidResp.Builder response=UserFeedback.GetByUidResp.newBuilder();
            String query2 = "select user_id,feedback from feedback_details where user_id =?;";
            PreparedStatement stmt2 = connection.prepareStatement(query2);
            stmt2.setInt(1, Integer.parseInt(request.getUid()));
            ResultSet rs = stmt2.executeQuery();
           while(rs.next()) {
               response.setUid(String.valueOf(rs.getInt(1)));
               response.setFeedback(rs.getString(2));
               responseObserver.onNext(response.build());
           }

               responseObserver.onCompleted();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void getBySpid(UserFeedback.commonSPID request, StreamObserver<UserFeedback.GetBySpidResp> responseObserver) {
//        super.getBySpid(request, responseObserver);
        String spid=request.getSpid();
        String url = "jdbc:postgresql://localhost:5432/feedback_service";
        String uname = "postgres";
        String pass = "test123";
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, uname, pass);
            System.out.println("connection established");
            UserFeedback.GetBySpidResp.Builder response=UserFeedback.GetBySpidResp.newBuilder();
            String query2 = "select sp_id,feedback from feedback_details where sp_id =?;";
            PreparedStatement stmt2 = connection.prepareStatement(query2);
            stmt2.setInt(1, Integer.parseInt(request.getSpid()));
            ResultSet rs = stmt2.executeQuery();
            while(rs.next()) {
                response.setSpid(String.valueOf(rs.getInt(1)));
                response.setFeedback(rs.getString(2));
                responseObserver.onNext(response.build());
            }

            responseObserver.onCompleted();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
