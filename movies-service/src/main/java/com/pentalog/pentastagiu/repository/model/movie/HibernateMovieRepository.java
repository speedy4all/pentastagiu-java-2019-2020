package com.pentalog.pentastagiu.repository.model.movie;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HibernateMovieRepository extends JpaRepository<Movie, String> {

    List<Movie> findAllByNameStartingWith(String startsWith);

}
