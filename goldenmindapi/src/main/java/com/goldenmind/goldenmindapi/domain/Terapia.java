package com.goldenmind.goldenmindapi.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name = "terapias")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Terapia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTerapia;
    @Column(name="nombreTerapia", nullable = false)
    private String nombreTerapia;
    @Column(name="description", nullable = false)
    private String description;
    @Column(name="nombreSeccion1", nullable = false)
    private String nombreSeccion1;
    @Column(name="nombreSeccion2", nullable = false)
    private String nombreSeccion2;
    @Column(name="nombreSeccion3", nullable = false)
    private String nombreSeccion3;
    @Column(name="reto1Seccion1", nullable= false)
    private String reto1Seccion1;
    @Column(name="reto2Seccion1", nullable= false)
    private String reto2Seccion1;
    @Column(name="reto1Seccion2", nullable= false)
    private String reto1Seccion2;
    @Column(name="reto2Seccion2", nullable= false)
    private String reto2Seccion2;
    @Column(name="reto1Seccion3", nullable= false)
    private String reto1Seccion3;
    @Column(name="reto2Seccion3", nullable= false)
    private String reto2Seccion3;
}