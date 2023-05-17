package com.goldenmind.goldenmindapi.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name = "pacientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaciente;
    @Column(name="nombrePaciente", nullable = false)
    private String nombrePaciente;
    @Column(name="nombreUsuario", nullable = false)
    private String nombreUsuario;
    @Column(name="passwordUsuario", nullable = false)
    private String passwordUsuario;
    @Column(name="edadPaciente", nullable = false)
    private int edadPaciente;
    @Column(name="generoPaciente", nullable = false)
    private String generoPaciente;
    @Column(name="telefonoPaciente", nullable = false)
    private int telefonoPaciente;
    @Column(name="correoPaciente", nullable = false)
    private String correoPaciente;
}
