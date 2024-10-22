package org.szymon.charitydonationplatform;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CharityRepositoryImplementation implements CharityRepository {
    private JdbcTemplate jdbc;
    private RowMapper<Charity> charity_row_mapper;

    public CharityRepositoryImplementation(JdbcTemplate aJdbc) {
        this.jdbc = aJdbc;

        set_charity_mapper();
    }

    private void set_charity_mapper() {
        charity_row_mapper = (rs, i) -> new Charity(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("description"),
                rs.getInt("donation_total")
        );
    }

    public List<Charity> get_charities() {
        String sql = "SELECT * FROM charities";
        return jdbc.query(sql, charity_row_mapper);
    }
}
