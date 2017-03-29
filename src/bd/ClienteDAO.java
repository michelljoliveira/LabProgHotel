package bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import projeto.Cliente;

public class ClienteDAO {
	
	static{
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static List<Cliente> getClienteBD(){
		
		List<Cliente> todos = new ArrayList<>();
		
		try(Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/clientes","postgres","admin")){
			
			String sql = "select nome, sobrenome, cpf from cliente";
			PreparedStatement stm = c.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			
			while(rs.next()){
				Cliente cliente = new Cliente(rs.getString("nome"), rs.getString("sobrenome"), rs.getString("cpf"));
				
				
				
				todos.add(cliente);
				
				
				
			}
			
			
			
		} catch (SQLException e) {
			
			throw new RuntimeException("Nao foi possivel",e);
		}
		
		
		
		
		return todos;
	}
	
	public static void inserirCliente(Cliente cliente){
		
		
		try(Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/clientes","postgres","admin")){
			
			String sql = "INSERT INTO public.cliente( nome, sobrenome, cpf) VALUES (?, ?, ?)";
			PreparedStatement stm = c.prepareStatement(sql);
			
			stm.setString(1, cliente.getNome());
			stm.setString(2, cliente.getSobrenome());
			stm.setString(3, cliente.getCpf());
			
			stm.executeUpdate();
			
			
				
				
			
			
			
			
		} catch (SQLException e) {
			
			throw new RuntimeException("Nao foi possivel",e);
		}
		
		
		
		
	}

}
