package org.openhab.io.semantic.tests;

import java.util.ArrayList;
import java.util.List;

import org.openhab.io.semantic.core.SemanticService;
import org.openhab.io.semantic.core.model.SimpleDeviceModel.DeviceInfo;
import org.openhab.io.semantic.core.util.QueryResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SemanticServiceTestImpl implements SemanticService {
    private static Logger logger = LoggerFactory.getLogger(SemanticServiceTestImpl.class);

    public void activate() {
        logger.debug("Test Impl of semantic service activated");
    }

    public void deactivate() {
        logger.debug("Test Impl of semantic service deactivated");
    }

    @Override
    public QueryResult executeSelect(String queryAsString) {
        return new QueryResultTestImpl(queryAsString);
    }

    @Override
    public QueryResult executeSelect(String queryAsString, boolean withLatestValues) {
        return new QueryResultTestImpl(queryAsString);
    }

    @Override
    public boolean executeAsk(String askAsString) {
        return true;
    }

    @Override
    public boolean executeAsk(String askAsString, boolean withLatestValues) {
        return true;
    }

    @Override
    public QueryResult sendCommand(String queryAsString, String command) {
        return new QueryResultTestImpl(queryAsString);
    }

    @Override
    public QueryResult sendCommand(String queryAsString, String command, boolean withLatestValues) {
        return new QueryResultTestImpl(queryAsString);
    }

    @Override
    public String getCurrentInstanceAsString() {
        return "static test instance";
    }

    @Override
    public void setAllValues() {

    }

    @Override
    public String getRestUrlForItem(String uid) {
        return null;
    }

    @Override
    public String getTypeName(String itemName) {
        return "default type name";
    }

    @Override
    public String getLocationName(String itemName) {
        return "default location name";
    }

    @Override
    public QueryResult getAllSensors() {
        return null;
    }

    @Override
    public boolean executeUpdate(String updateStmt) {
        return false;
    }

    @Override
    public List<DeviceInfo> getAllDeviceInfos() {
        return new ArrayList<>();
    }

    @Override
    public List<DeviceInfo> getDeviceInfoForId(String deviceId) {
        return null;
    }

    @Override
    public String mergeDevices(String deviceId1, String deviceId2) {
        return null;
    }

}
