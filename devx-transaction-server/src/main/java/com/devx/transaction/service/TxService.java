package com.devx.transaction.service;

import com.devx.transaction.service.model.TxServer;
import com.devx.transaction.service.model.TxState;

/**
 * Created by lorne on 2017/7/1.
 */
public interface TxService {

    TxServer getServer();

    TxState getState();

    String sendMsg(String model, String msg);

    boolean checkClearGroup(String groupId, String taskId, int isGroup);

    int checkGroup(String groupId, String taskId);
}
