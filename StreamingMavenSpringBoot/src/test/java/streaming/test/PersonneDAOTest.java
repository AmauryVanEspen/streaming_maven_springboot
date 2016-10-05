/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.dao.PersonneDAO;
import streaming.entity.Personne;
import streaming.spring.SpringConfig;

/**
 *
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class PersonneDAOTest {

    @Autowired
    private PersonneDAO dao;

    @Test
    public void rechercher() {
        dao.rechercher(1L);
    }

    @Test
    public void ajouter() {
        Personne p = new Personne();
        p.setNom("Amaury");
        
        dao.ajouter(p);
    }
    
    @Test
    public void supprimer(){
        new PersonneDAO().supprimer(1L);
    }
    
    @Test
    public void lister(){
        List<Personne> personnes = new PersonneDAO().lister();
    }
    
    @Test
    public void modifier(){
        Personne p = new Personne();
        p.setId(1L);
        p.setNom("Amaury Van Espen");
        
        new PersonneDAO().modifier(p);
    }

}
