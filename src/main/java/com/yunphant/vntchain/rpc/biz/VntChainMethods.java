package com.yunphant.vntchain.rpc.biz;

import com.fasterxml.jackson.databind.JsonNode;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * 以太坊接口
 * eth_mining eth_hashrate eth_getUncleCountByBlockHash eth_getUncleCountByBlockNumber eth_signTransaction
 * eth_getUncleByBlockHashAndIndex eth_getUncleByBlockNumberAndIndex
 *
 * 这些没有对应的VNT CHAIN的接口
 */
public interface VntChainMethods {
    String vnt_clientVersion() throws Throwable;
    String vnt_sha3(String data) throws Throwable;
    String net_version() throws Throwable;
    Boolean net_listening() throws Throwable;
    String net_peerCount() throws Throwable;
    String core_protocolVersion() throws Throwable;
    Object core_syncing() throws Throwable;
    String core_coinbase() throws Throwable;
    String core_gasPrice() throws Throwable;
    ArrayList<String> core_accounts() throws Throwable;
    String core_blockNumber() throws Throwable;
    String core_getBalance(String addr, String tag) throws Throwable;
    String core_getStorageAt(String addr, String pos, String tag) throws Throwable;
    String core_getTransactionCount(String addr, String tag) throws Throwable;
    String core_getBlockTransactionCountByHash(String hash) throws Throwable;
    String core_getBlockTransactionCountByNumber(String blockNum) throws Throwable;
    String core_getCode(String addr, String tag) throws Throwable;
    String core_sign(String addr, String data) throws Throwable;
    String core_sendTransaction(JsonNode obj) throws Throwable;
    String core_sendRawTransaction(String data) throws Throwable;
    String core_call(JsonNode obj, String tag) throws Throwable;
    String core_estimateGas(JsonNode obj) throws Throwable;
    JsonNode core_getBlockByHash(String hash, Boolean full) throws Throwable;
    JsonNode core_getBlockByNumber(String number, Boolean full) throws Throwable;
    JsonNode core_getTransactionByHash(String hash) throws Throwable;
    JsonNode core_getTransactionByBlockHashAndIndex(String hash, String index) throws Throwable;
    JsonNode core_getTransactionByBlockNumberAndIndex(String number, String index) throws Throwable;
    JsonNode core_getTransactionReceipt(String hash) throws Throwable;
    String core_newFilter(JsonNode obj) throws Throwable;
    String core_newBlockFilter() throws Throwable;
    String core_newPendingTransactionFilter() throws Throwable;
    Boolean core_uninstallFilter(String id) throws Throwable;
    JsonNode core_getFilterChanges(String id) throws Throwable;
    JsonNode core_getFilterLogs(String id) throws Throwable;
    JsonNode core_getLogs(JsonNode obj) throws Throwable;
    String shh_version() throws Throwable;
    Boolean shh_post(JsonNode obj) throws Throwable;
    ArrayList<JsonNode> core_getAllCandidates() throws Throwable;
    JsonNode core_getStake(String addr) throws Throwable;
    JsonNode core_getVoter(String addr) throws Throwable;
    BigInteger core_getRestVNTBounty() throws Throwable;
}
