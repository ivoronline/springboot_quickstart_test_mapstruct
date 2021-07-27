package com.ivoronline.springboot_quickstart_test_mapstruct.controllers;

import com.ivoronline.springboot_quickstart_test_mapstruct.dto.AuthorBookDTO;
import com.ivoronline.springboot_quickstart_test_mapstruct.entities.Author;
import com.ivoronline.springboot_quickstart_test_mapstruct.mappers.AuthorBookMapper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @RequestMapping("/AddAuthorBook")
  public Author addAuthorBook(@RequestBody AuthorBookDTO authorBookDTO) {

    //INSTANTIATE MAPPER
    AuthorBookMapper authorBookMapper = AuthorBookMapper.INSTANCE;

    //MAP AUTHORBOOKDTO TO AUTHOR & BOOK.
    Author author = authorBookMapper.mapToAuthor(authorBookDTO);

    //RETURN SOMETHING
    return author;

  }

}
