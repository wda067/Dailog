package com.dailog.api.request.comment;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;

@Getter
public class CommentCreateForAnonymous {

    @Size(min = 1, max = 8, message = "이름을 1~8자로 입력해 주세요.")
    private final String anonymousName;

    @Size(min = 4, max = 30, message = "비밀번호는 4~30자로 입력해 주세요.")
    private final String password;

    @NotBlank(message = "댓글을 입력해 주세요.")
    @Size(max = 1000, message = "댓글은 1,000자까지 입력해 주세요.")
    private final String content;

    private final String parentId;

    @Builder
    public CommentCreateForAnonymous(String anonymousName, String password, String content, String parentId) {
        this.anonymousName = anonymousName;
        this.password = password;
        this.content = content;
        this.parentId = parentId;
    }
}
