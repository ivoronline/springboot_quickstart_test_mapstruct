package com.ivoronline.springboot_quickstart_test_mapstruct.mappers;

import com.ivoronline.springboot_quickstart_test_mapstruct.dto.AuthorBookDTO;
import com.ivoronline.springboot_quickstart_test_mapstruct.entities.Author;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorBookMapper {

  AuthorBookMapper INSTANCE = Mappers.getMapper(AuthorBookMapper.class);

  //Annotations can be used to map Properties with different names
  @Mapping(source = "authorAge", target = "age")  //For additional Properties with different names
  Author mapToAuthor(AuthorBookDTO authorBookDTO);

}
