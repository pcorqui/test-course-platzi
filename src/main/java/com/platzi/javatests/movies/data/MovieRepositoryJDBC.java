package com.platzi.javatests.movies.data;

import com.platzi.javatests.movies.model.Genre;
import com.platzi.javatests.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

public class MovieRepositoryJDBC implements MovieRepository {

    //objeto jdbc incluido en spring jdbc para conectar con la base de datos
    private JdbcTemplate jdbcTemplate;

    public MovieRepositoryJDBC(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findById(long id) {
        return null;
    }

    @Override
    public Collection<Movie> findAll() {
        //solicitamos consulta a la base de datos
        return jdbcTemplate.query("select * from movies",movieMapper);
    }

    @Override
    public void saveorUpdate(Movie movie) {

    }

    @Override
    public Collection<Movie> findByLength() {
        return null;
    }

    //para usarse con otros metodos
    //lo que hacemos es mapear el resultado de la base de datos a un objeto Movie
    public static RowMapper<Movie> movieMapper = new RowMapper<Movie>(){
        @Override
        public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Movie(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("minutes"),
                    Genre.valueOf(rs.getString("genre"))
            );
        }
    };
}
