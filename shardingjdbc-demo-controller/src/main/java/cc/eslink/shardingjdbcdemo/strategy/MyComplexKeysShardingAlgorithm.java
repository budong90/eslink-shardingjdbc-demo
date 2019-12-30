package cc.eslink.shardingjdbcdemo.strategy;

import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 *@ClassName MyComplexKeysShardingAlgorithm
 *@Description
 *@Author zeng.yakun (0178)
 *@Date 2019/12/30 16:57
 *@Version 1.0
 **/
public class MyComplexKeysShardingAlgorithm implements ComplexKeysShardingAlgorithm {


    @Override
    public Collection<String> doSharding(Collection availableTargetNames, ComplexKeysShardingValue shardingValue) {
        List<String> shardingResults = new ArrayList<>();
        String tenantId = ((List<String>) shardingValue.getColumnNameAndShardingValuesMap().get("tenant_id")).get(0);
        String logicTableName = shardingValue.getLogicTableName();
        if ("1P01".equals(tenantId)) {
            shardingResults.add(logicTableName + "_" + tenantId.toLowerCase());
        } else {
            shardingResults.add(logicTableName);
        }
        System.out.println(String.format("分片结果-----------------------------tenantId=%s,shardingResults=%s-----------------------------", tenantId, shardingResults));
        return shardingResults;
    }
}
