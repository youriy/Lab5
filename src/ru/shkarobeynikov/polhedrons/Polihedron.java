
package ru.shkarobeynikov.polhedrons;

import ru.shkarobeynikov.interfaces.Volume;
import ru.shkarobeynikov.interfaces.Area;

/**
 *
 * @author ura
 */

/**
* Класс - правильный многоугольник в 3-х мерном пространстве
*/
abstract public class Polihedron implements Area,Volume{
    /**
     * имя объекта
     */
    private String name;
    /**
     * дата и время создания объекта
     */
    private String dateTime;
    /**
     * количество граней
     */
    public int verge;
    /**
     * количество вершин
     */
    public int top;
    /**
     * длина ребра
     */
    public double d;
    /**
     * порядковый номер
     */
    public int id;
    private static int nextId=1;
    { id = nextId++; }
    
    /**
     *
     * @param d
     */
    public Polihedron (double d){
        this.d=d;
    }
    
    /**
     *
     * @param p
     */
    public Polihedron(Polihedron p){ // второй конструктор
        this(p.getD()); // вызов первого конструктора
    }
    
    public int getId(){
       return id;
    }
    
    public String getName(){
        return name;
    }
    
    /**
     *
     * @param n
     */
    public void setName(String n){
        name=n;
    }
    
    public double getD(){
        return d;
    }
    
    /**
     *
     * @param k
     */
    public void setVerge(int k){
        verge=k;
    }
   
    public int getVerge(){
        return verge;
    }
    
    /**
     *
     * @param m
     */
    public void setTop(int m){
        top=m;
    }
    
    public int getTop(){
        return top;
    }
    
    public String getDateTame(){
        return dateTime;
    }
    
    /**
     *
     * @param d
     */
    public void setDateTime(String d){
        dateTime=d;
    }
    /**
     * метод возвращает радиус вписанной окружности
     * @return
     */
    abstract public double getInscribedRadius();
    
    /**
     * метод возвращает радиус описанной окружности
     * @return
     */
    abstract public double getDescribedRadius();
    
    @Override
    abstract public double area();
        
    @Override
    abstract public double volume();
}