package com.ruben.server.repo;

import com.ruben.server.ennumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@lombok.Getter
@lombok.Setter
@ToString



public class Server  {
    @Id
    @GeneratedValue(strategy  = GenerationType.AUTO)
    private Long id;
    private String ipAdress;
    private String name ;
    private String memory;
    private String type;
    private String imageurl;
    private Status status;

}
