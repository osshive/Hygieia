package com.capitalone.dashboard.repository;

import com.capitalone.dashboard.model.Collector;
import com.capitalone.dashboard.model.CollectorItem;
import com.capitalone.dashboard.model.CollectorType;
import com.capitalone.dashboard.model.Commit;
import com.capitalone.dashboard.model.Component;
import com.capitalone.dashboard.model.GitRequest;
import com.capitalone.dashboard.model.TestResult;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Map;


public interface CustomRepositoryQuery {
    List<CollectorItem> findCollectorItemsBySubsetOptions(ObjectId id, Map<String, Object> allOptions, Map<String, Object> selectOptions);
    List<Component> findComponents(Collector collector);
    List<Component> findComponents(CollectorType collectorType);
    List<Component> findComponents(Collector collector, CollectorItem collectorItem);
    List<Component> findComponents(ObjectId collectorId, CollectorType collectorType, CollectorItem collectorItem);
    List<Component> findComponents(ObjectId collectorId, CollectorType collectorType, ObjectId collectorItemId);
    List<Commit> findByScmUrlAndScmBranchAndScmCommitTimestampGreaterThanEqualAndScmCommitTimestampLessThanEqual(String scmUrl, String scmBranch, long beginDt, long endDt);
    List<GitRequest> findByScmUrlIgnoreCaseAndScmBranchIgnoreCaseAndMergedAtGreaterThanEqualAndMergedAtLessThanEqual(String scmUrl, String scmBranch, long beginDt, long endDt);
    List<TestResult> findByUrlAndTimestampGreaterThanEqualAndTimestampLessThanEqual(String jobUrl,long beginDt,long endDt);

}
