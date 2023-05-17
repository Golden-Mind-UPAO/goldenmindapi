package com.goldenmind.goldenmindapi.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name = "recursoseducativos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RecursoEducativo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRecursoEducativo;
    @Column(name="nombreRecurso", nullable = false)
    private String nombreRecurso;
    @Column(name="tipoRecurso", nullable = false)
    private String tipoRecurso;
    @Column(name="autor", nullable = false)
    private String autor;
    @Column(name="detalleRecurso", nullable= false)
    private String detalleRecurso;
}