package com.team8.volunteerworkproject.service;

import com.team8.volunteerworkproject.dto.request.EnrollmentRequestDto;
import com.team8.volunteerworkproject.dto.response.EnrollmentResponseDto;
import com.team8.volunteerworkproject.security.UserDetailsImpl;

public interface EnrollmentService {

/*
    void participation(Long postId, String userId);
*/
    //참가 신청
    EnrollmentResponseDto attend(Long postId, EnrollmentRequestDto requestDto, String userId);

    //참가 신청 취소(삭제)
    void cancel(Long postId, String userId, Long enrollmentId);
}
