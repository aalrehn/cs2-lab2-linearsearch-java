package edu.luc.cs.cs271.lab2;


import org.junit.Test;
import static org.junit.Assert.*;

public class TestTeam {
  
  Team makeTeamFixture(final String name, final String headcoach, final int funding) {
    return new Team(name, headcoach, funding);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructorValidName() {
     
          new Team(null, "Klinsmann", 500);          
      } 
    
  
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorValidHeadcoach(){
       
            new Team ("USA", null , 500);
            
            
                 
        
    }
   @Test(expected = IllegalArgumentException.class)
    public void testConstructorValidFunding(){
        
            new Team("USA", "Klinsmann", -1 );
            
    }


  @Test
  public void testGetName() {
    final String name = "USA";
    final Team t = makeTeamFixture(name, "Klinsmann", 500);
    assertEquals(name, t.getName());
  }
   @Test
  public void testGetHeadcoach(){
    final String headcoach = "Löw";
    final Team p = makeTeamFixture("Germany", headcoach, 700);
    assertEquals(headcoach, p.getHeadcoach());
  }
  
 @Test
  public void testGetFunding(){
    final int funding = 600;
    final Team f = makeTeamFixture("Chile", "Rueda", funding);
    assertEquals(funding, f.getFunding());
  }
}
 


