package com.kasperserzysko.web.services.interfaces;

import com.kasperserzysko.web.dtos.SecurityUserDto;
import com.kasperserzysko.web.dtos.UserDto;
import com.kasperserzysko.web.exceptions.CommentNotFoundException;
import com.kasperserzysko.web.exceptions.UserNotFoundException;

public interface ICommentService {

    UserDto getCommentCreator(Long commentId) throws UserNotFoundException;
    void likeComment(Long commentId, SecurityUserDto securityUserDto) throws CommentNotFoundException, UserNotFoundException;
    int getCommentLikes(Long commentId) throws CommentNotFoundException;
    void dislikeComment(Long commentId, SecurityUserDto securityUserDto) throws CommentNotFoundException, UserNotFoundException;
    int getCommentDislikes(Long commentId) throws CommentNotFoundException;
    void removeLike(Long commentId, SecurityUserDto securityUserDto) throws CommentNotFoundException, UserNotFoundException;
    void removeDislike(Long commentId, SecurityUserDto securityUserDto) throws CommentNotFoundException, UserNotFoundException;
}
