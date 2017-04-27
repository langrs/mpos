package com.site.webService.giftProcess;

import java.util.List;

/**
 * Created by Administrator on 2017/4/26.
 *
 */
public class DetailResult {
    protected String node_id;
    protected String name;
    protected RecordResult Record;

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RecordResult getRecord() {
        return Record;
    }

    public void setRecord(RecordResult record) {
        Record = record;
    }
}
