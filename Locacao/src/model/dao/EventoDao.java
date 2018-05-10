package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Evento;

public class EventoDao extends BaseDAO {

	public List<Evento> getListEvento() throws SQLException {
		Connection con = null;
		PreparedStatement p = null;

		List<Evento> list = new ArrayList<>();
		try {
			con = getConnection();
			p = con.prepareStatement("select * from Evento");
			ResultSet rs = p.executeQuery();
			while (rs.next()) {
				Evento e = createEvento(rs);
				list.add(e);
				System.out.println(e.getNome());
			}
			rs.close();

		} finally {
			if (p != null) {
				p.close();
			}
			if (p != null) {
				p.close();
			}

		}
		return list;

	}

	public Evento createEvento(ResultSet rs) throws SQLException {

		Evento e = new Evento();
		e.setId(rs.getInt("id"));
		e.setNome(rs.getString("nome"));

		return e;

	}

	public Evento updateEvento(ResultSet rs) throws SQLException {

		Evento e = new Evento();
		e.setId(rs.getInt("id"));
		e.setNome(rs.getString("nome"));

		return e;

	}

	public Evento deleteEvento(ResultSet rs) throws SQLException {

		Evento e = new Evento();
		e.setId(rs.getInt("id"));
		e.setNome(rs.getString("nome"));

		return e;

	}
}
