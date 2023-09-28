/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemon_me;

import java.util.*;

public class Pokemon_Me {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
         System.out.println("Welcome to Pokemon Battle!");
            try {   
               Thread.sleep(1500);
           } catch (InterruptedException e) {
           }
         System.out.print("Enter a name for your Pokemon: ");
         String name = scan.nextLine();
         System.out.println("Select Pokemon Type:");
         
         System.out.println("1. Grass");
         System.out.println("2. Fire");
         System.out.println("3. Rock");
         System.out.print("Select a number to choose: ");
         int choice = scan.nextInt();
          
         switch(choice){
            
             case 1:
            Grass g = new Grass(name);   
                g.getHealth();                
                g.getAttack();
            do{
        System.out.println("Select an Action for you Pokemon "+name);
        System.out.print("\n 1. Train \n 2. Rest \n 3. Display Stat \n 4. Skill Test\n 5. Exit Game\n");
        choice = scan.nextInt();  
            switch(choice){
                case 1:
                    g.train();             
                    System.out.println("Health:"+g.getHealth());
                    System.out.println("Attack:"+g.getAttack());
                     break;
                    
                case 2:
                    g.rest();
                    break;
            
                case 3:
                    g.displayStats();
                    break;
            
                case 4: 
                    System.out.println("Choose a skill to test");
                    System.out.print("1.specialAttack1 \n2.tailWhip \n3.Heal \n4.normalAttack\n");
                    int Skill = scan.nextInt();
                    
                    switch(Skill){
                    
                    case 1:
                        g.specialAttack1();
                        break;
                    
                    case 2:
                        g.tailWhip();
                        break;
                        
                    case 3:
                        g.heal();
                        break;
                        
                    case 4:
                        g.normalAttack();
                        break;    
                }
            }
            }
                    while(choice != 5);
                    System.out.println("Thank you for playing!");
                    break;
                    case 2:

             Fire f = new Fire(name);
            f.getHealth();
            f.getAttack();
            do{
        System.out.println("Select an Action for you Pokemon "+name);   
        System.out.print("\n 1. Train \n 2. Rest \n 3. Display Stat \n 4. Skill Test\n 5. Exit Game\n");
        choice = scan.nextInt(); 
                switch(choice){
                case 1:
                f.train();             
                    System.out.println("Health:"+f.getHealth());
                    System.out.println("Attack:"+f.getAttack());
                    break;
            
                case 2:
                f.rest();
                break;
            
                case 3:
                f.displayStats();
                break;
            
                case 4: 
                    System.out.println("Choose a skill to test");
                    System.out.print("1.Fire Tornado \n2.Ember \n3.Heal \n4.normalAttack\n");
                    int Skill = scan.nextInt();
                    
                    switch(Skill){
                    
                    case 1:
                        f.specialAttack1();
                        break;
                    
                    case 2:
                        f.specialAttack2();
                        break;
                        
                    case 3:
                        f.heal();
                        break;
                        
                    case 4:
                        f.normalAttack();
                        break;    
                }
                
            }

        }       while(choice != 5);
                System.out.println("Thank you for playing!");
                break;
            
            case 3:
             Rock r = new Rock(name);
            r.getHealth();
            r.getAttack();
            do{
        System.out.println("Select an Action for you Pokemon "+name);   
        System.out.print("\n 1. Train \n 2. Rest \n 3. Display Stat \n 4. Skill Test\n 5. Exit Game\n");
        choice = scan.nextInt(); 
                switch(choice){
                case 1:
                r.train();             
                    System.out.println("Health:"+r.getHealth());
                    System.out.println("Attack:"+r.getAttack());
                    break;
            
                case 2:
                    r.rest();
                    break;
            
                case 3:
                    r.displayStats();
                    break;
            
                case 4: 
                System.out.println("Choose a skill to test");
                    System.out.print("1.Rock Throw \n2.Rock Throw \n3.Heal \n4.normalAttack\n");
                    int Skill = scan.nextInt();
                    
                    switch(Skill){
                    
                    case 1:
                        r.specialAttack1();
                        break;
                    
                    case 2:
                        r.specialAttack2();
                        break;
                        
                    case 3:
                        r.heal();
                        break;
                        
                    case 4:
                        r.normalAttack();
                        break;
            }
        }       
                }while(choice != 5);
                System.out.println("Thank you for playing!");
                break;
        }
    }
}
         
    

        
