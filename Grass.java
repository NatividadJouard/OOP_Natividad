/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon_me;
import java.util.*;
/**
 *
 * @author user
 */
public class Grass {
 private String name;
    private int health;
    private int attack;
    private Random random = new Random();

    public Grass(String name) {
        this.name = name;
        this.health = 100;
        this.attack = 20;
    } 
    public void train(){
       
    this.attack+= random.nextInt(5);
    
    this.health -= random.nextInt(5);
    System.out.println("Your Pokemon "+name+" has been trained");
    
    }
    
    public void rest() {
        this.health += random.nextInt(5);
        System.out.println("Your Pokemon "+name+" was healed");
        
    }
    public void displayStats() {
        System.out.println("Pokemon: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attack);
    }
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public void specialAttack1() {
        int damage = random.nextInt(10) + 15;
        System.out.println(name + " used Leaf Blast and dealt " + damage + " damage!");
        
    }

    public void tailWhip() {
        int debuffAmount = random.nextInt(4) + 1;
        System.out.println(name + " used Tail Whip and debuffed opponent's defense by " + debuffAmount + "!");
        
    }

    public void heal() {
    int healingAmount = random.nextInt(10) + 10;
        System.out.println(name + " used Heal and restored " + healingAmount + " health!");
        
    }

    public void normalAttack() {
        int damage = random.nextInt(8) + 18;
        System.out.println(name + " used Normal Attack and dealt " + damage + " damage!");
        
    }
    

   
}