package pl.uzi.springdataexample;

import javax.persistence.*;

@Entity
@Table(name = "MyCar")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mark;

    //Przez adnotacje Transient, pole nie zostanie zmapowane do bazy danych
    @Transient
    private String model;
    //Przez okreslenie EnumType w adnotacji Enumerated, wartosc zostanie zapisana
    // do bazy jako String, nie jako standardowy integer
    @Enumerated(EnumType.STRING)
    private Color color;


    public Car() {
    }

    public Car(String mark, String model, Color color) {
        this.mark = mark;
        this.model = model;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car:\nMark: " + mark + "\nModel: " + model + "\nColor: " + color;
    }
}
