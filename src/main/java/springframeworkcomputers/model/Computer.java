package springframeworkcomputers.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Computer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String graphicscard;
  private String motherboard;
  private String procesor;
  private String ram;

  public Computer(String motherboard) {
    this.motherboard = motherboard;
  }

  public Computer(String graphicscard, String motherboard, String procesor, String ram) {
    this.graphicscard = graphicscard;
    this.motherboard = motherboard;
    this.procesor = procesor;
    this.ram = ram;
  }

  public long getId() { return id; }

  public void setId(long id) {
    this.id = id;
  }


  public String getGraphicscard() {
    return graphicscard;
  }

  public void setGraphicscard(String graphicscard) {
    this.graphicscard = graphicscard;
  }


  public String getMotherboard() {
    return motherboard;
  }

  public void setMotherboard(String motherboard) {
    this.motherboard = motherboard;
  }


  public String getProcesor() {
    return procesor;
  }

  public void setProcesor(String procesor) {
    this.procesor = procesor;
  }


  public String getRam() {
    return ram;
  }

  public void setRam(String ram) {
    this.ram = ram;
  }

}
