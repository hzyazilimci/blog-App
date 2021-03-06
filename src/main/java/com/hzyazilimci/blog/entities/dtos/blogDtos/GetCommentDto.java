package com.hzyazilimci.blog.entities.dtos.blogDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCommentDto {

    private int id;
    private String username;
    private String email;
    private String commentBody;
    private LocalDate commentDate;
    private String title;
}
