package com.fit_track_api.fit_track_api.controller;


import com.fit_track_api.fit_track_api.controller.dto.request.CreateCommentRequestDTO;
import com.fit_track_api.fit_track_api.controller.dto.response.GetCommentResponseDTO;
import com.fit_track_api.fit_track_api.model.Comment;
import com.fit_track_api.fit_track_api.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comment")
@AllArgsConstructor
public class CommentController {


    private CommentService commentService;


    @PostMapping("/achievement/{achievementId}/user/{userId}")
    public ResponseEntity<String> addComment(@PathVariable Long achievementId , @PathVariable Long userId , @RequestBody CreateCommentRequestDTO createCommentRequestDTO){
         commentService.addComment(achievementId,userId,createCommentRequestDTO);
        return ResponseEntity.ok("Comment added successfully");
    }

    @PutMapping("/{commentId}")
    public ResponseEntity<Comment> updateComment(@PathVariable Long achievementId, @RequestParam String newContent){
        Comment updatedComment = commentService.updateComment(achievementId, newContent);
        return ResponseEntity.ok(updatedComment);

    }
    @DeleteMapping("/{commentId}")
    public ResponseEntity<String> deleteComment(@PathVariable Long commentId,@RequestParam Long userId){
        commentService.deleteComment(commentId,userId);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/achievement/{achievementId}")
    public ResponseEntity<List<GetCommentResponseDTO>> getCommentsByAchievement(@PathVariable Long achievementId){
        List<GetCommentResponseDTO> comments = commentService.getCommentsByAchievement(achievementId);
        return ResponseEntity.ok(comments);
    }


}
