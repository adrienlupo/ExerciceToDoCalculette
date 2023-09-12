package app.m2i.bdd;


import java.sql.*;


public class GestBDD {

	public static Connection connection;
	
	public void connection() {
		
		try {
			//étape 1 : charger la classe de driver
			Class.forName("com.mysql.jdbc.Driver");
            
			//étape 2 : créer l'objet de connexion
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/todolist",
	                "root", null);
       
             System.out.println("connexion ok....");
             
	     } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

		}
	
	
	
             
      public void afficherToDo () {       
             
    	  System.out.println("Affichage de la To Do List : ");
             
    	  try {
            
            Statement stmt = connection.createStatement();            
            ResultSet rs = stmt.executeQuery("select * from listetaches");
               
            while (rs.next()) {
                    String tache = rs.getString("tache");
                    int id = rs.getInt("id");
                    System.out.println(id + " " + tache);
            }
            
            rs.close();
            stmt.close();
           
            
    	  } catch (SQLException e) {
  	        // TODO Auto-generated catch block
  	        e.printStackTrace();
  	    }
    	  
      }
      
    
	
	public void AjoutDansBdd(String tache){
		
		System.out.println("Ajout d'un élément : ");
		
		try {
			String sql = "INSERT INTO listetaches (tache) VALUES (?) ";
			
			PreparedStatement ps = connection.prepareStatement (sql);
			
			ps.setString(1, tache);
			System.out.println("Elément ajouté : " + tache );
			
			ps.execute();
			ps.close();
		}
		
			catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
				
	}
	
	
	public void SuppDansBdd(int id){
		
		System.out.println("Suppression d'un élément : ");
		
		try {
			String sql = "DELETE FROM listetaches WHERE id =?";
			
			PreparedStatement ps = connection.prepareStatement (sql);
			
			ps.setInt(1, id);
			System.out.println("ID n° " + id + " supprimé" );
			
			ps.execute();
			
			ps.close();
		}
		
			catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
				
	}	
	
	
	
	
	
	

	  public void close() {       
          try {
          connection.close();
          } catch (SQLException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
          
  }  
	
}
