package com.vishbh.pojos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "TABLE_DATABASE_PLUGIN")
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class DatabasePlugin implements IDatabasePlugin {

    @Id
    @Column(name = "DB_PLUGIN_ID")
    private String id;

    @Column(name = "AKTION", nullable = false)
    private String action;

    @Column(name = "ZEITPUNKT", nullable = false)
    private String actionTime;

    @Column(name = "REIHENFOLGE", nullable = false)
    private int order;

    @Override
    public String getId() {
        return id;
    }
}
