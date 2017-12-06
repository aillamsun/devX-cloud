package com.devx.transaction.service;


import com.devx.transaction.mq.model.TxGroup;

/**
 * Created by lorne on 2017/6/9.
 */
public interface TransactionConfirmService {

    void confirm(TxGroup group);
}
