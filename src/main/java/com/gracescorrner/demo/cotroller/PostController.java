//package com.gracescorrner.demo.cotroller;
//
//import com.gracescorrner.demo.data.models.Post;
//import com.gracescorrner.demo.data.models.User;
//import com.gracescorrner.demo.dtos.requests.CreatePostRequest;
//import com.gracescorrner.demo.dtos.requests.DeletePostRequest;
//import com.gracescorrner.demo.dtos.requests.FindPostByIdRequest;
//import com.gracescorrner.demo.dtos.requests.FindPostRequest;
//import com.gracescorrner.demo.service.PostService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatusCode;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/v1/post")
//public class PostController {
//    @Autowired
//    PostService postService;
//
//    @PostMapping("/create_entry")
//    public ResponseEntity<Post> createPost(@RequestBody CreatePostRequest createPostRequest){
//        try{
//            Post savedPost = postService.createPost(createPostRequest);
//            return new ResponseEntity<>(savedPost, HttpStatusCode.valueOf(200));
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @GetMapping("/find_post")
//    public ResponseEntity<Post> findPost(@RequestBody FindPostRequest findPostRequest){
//        try{
//            Post foundPost = postService.findPost(findPostRequest);
//            System.out.println(foundPost);
//            return new ResponseEntity<>(foundPost, HttpStatusCode.valueOf(200));
//        }
//        catch (Exception exception){
//            throw new RuntimeException(exception);
//        }
//    }
//
//    @DeleteMapping("/delete_post")
//    public ResponseEntity<Post> deletePost(@RequestBody DeletePostRequest deletePostRequest){
//        try{
//            Post deletedPost = postService.deletePost(deletePostRequest);
//            return new ResponseEntity<>(deletedPost, HttpStatusCode.valueOf(200));
//        }
//        catch (Exception exception){
//            throw new RuntimeException(exception);
//        }
//    }
//}
//
