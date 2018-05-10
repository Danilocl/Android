package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Expositor;
import model.Fabricante;

public class FabricanteDao extends BaseDAO{

	public List<Fabricante> getListExpositor() throws SQLException {
		Connection con = null;
		PreparedStatement p = null;

		List<Fabricante> list = new ArrayList<>();
		try {
			con = getConnection();
			p = con.prepareStatement("select * from Fabricante");
			ResultSet rs = p.executeQuery();
			while (rs.next()) {
				// Fabricante e = createFabricante(rs);
				// list.add(e);
//				System.out.println(e.getNomeUser());
//				System.out.println(e.getNomeFantasy());
//				System.out.println(e.getEnde());
//				System.out.println(e.getLjFisica());
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

	public Expositor createFabricante(ResultSet rs) throws SQLException {

		Expositor e = new Expositor();
		e.setEnde(rs.getString("expositor_ende"));
		e.setIdUser(rs.getInt("expositor_id"));
		e.setLjFisica(rs.getString("expositor_ljFisica"));
		e.setNomeFantasy(rs.getString("expositor_nomeFantasy"));
		e.setNomeUser(rs.getString("expositor_nomeUser"));

		return e;

	}

	public void update(Fabricante fabricante) throws SQLException {
		Connection con = getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(
					"UPDATE expositor SET ende = ? ljFisica = ? nomeUser = ? nomeFantasy = ? WHERE idUser = ?");
			// ps.setString(1, expositor.getEnde());
			// ps.setString(2, expositor.getLjFisica());
			// ps.setString(3, expositor.getNomeFantasy());
			// ps.setString(4, expositor.getNomeUser());
			ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteFabricante(Fabricante fabricante) throws SQLException {
		Connection con = getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("DELETE FROM expositor WHERE id = ?");
			// ps.setInt(2, expositor.getIdUser());
			ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
