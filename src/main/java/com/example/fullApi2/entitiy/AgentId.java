package com.example.fullApi2.entitiy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "agent")
public class AgentId {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String agentId;
    private Integer amount;
}
