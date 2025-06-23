package in.orcas.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.orcas.config.DataSourceConfig;

@Service
public class DatabaseService {

    private final DataSourceConfig dataSourceConfig;

    @Autowired
    public DatabaseService(DataSourceConfig dataSourceConfig) {
        this.dataSourceConfig = dataSourceConfig;
    }

    public void printDbInfo() {
        System.out.println("DB URL: " + dataSourceConfig.getUrl());
        System.out.println("Username: " + dataSourceConfig.getUsername());
    }
}
