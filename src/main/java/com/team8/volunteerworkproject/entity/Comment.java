package com.team8.volunteerworkproject.entity;

import com.team8.volunteerworkproject.dto.request.CommentRequestDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Comment extends Timestamp {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long commentId;

  @Column(nullable = false)
  private String contents;

  private String userNickname;

  private String userId;

  //연관관계 끊기
  @ManyToOne
  @JoinColumn(name = "post_id", nullable = false)
  private VolunteerWorkPost volunteerWorkPost;

  public Comment(CommentRequestDto requestDto, String userId, String userNickname,
      VolunteerWorkPost volunteerWorkPost) {
    this.contents = requestDto.getContents();
    this.userNickname = userNickname;
    this.userId = userId;
    this.volunteerWorkPost = volunteerWorkPost;
  }
//  Comment comment = new Comment(requestDto, userDetails.getUserId(), volunteerWorkPost);
//    commentRepository.save(comment);

  public void updateComment(CommentRequestDto requestDto) {
    this.contents = requestDto.getContents();
  }

}
