package dao;



import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;

/**
 * Methods to add picture information to PictureAppDB
 * SELECT FROM pictures to view
 * INSERT INTO for new pictures when they are taken
 * DELETE FROM table
 */

public class JdbcPictureDao {

    JdbcTemplate myTemplate = new JdbcTemplate();
    //SqlRowSet



}
