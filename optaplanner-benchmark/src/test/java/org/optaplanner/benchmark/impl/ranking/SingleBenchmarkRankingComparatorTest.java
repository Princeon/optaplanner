/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.benchmark.impl.ranking;

import org.junit.Test;
import org.optaplanner.benchmark.impl.result.ProblemBenchmarkResult;
import org.optaplanner.benchmark.impl.result.SingleBenchmarkResult;
import org.optaplanner.benchmark.impl.result.SolverBenchmarkResult;
import org.optaplanner.core.api.score.buildin.simple.SimpleScore;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.optaplanner.core.impl.testdata.util.PlannerAssert.assertCompareToOrder;

public class SingleBenchmarkRankingComparatorTest {

    @Test
    public void compareTo() {
        SingleBenchmarkRankingComparator comparator = new SingleBenchmarkRankingComparator();
        SingleBenchmarkResult a = new SingleBenchmarkResult(mock(SolverBenchmarkResult.class), mock(ProblemBenchmarkResult.class));
        a.setFailureCount(1);
        a.setAverageScore(null);
        SingleBenchmarkResult b = new SingleBenchmarkResult(mock(SolverBenchmarkResult.class), mock(ProblemBenchmarkResult.class));
        b.setFailureCount(0);
        b.setAverageScore(SimpleScore.valueOf(-7, -1));
        SingleBenchmarkResult c = new SingleBenchmarkResult(mock(SolverBenchmarkResult.class), mock(ProblemBenchmarkResult.class));
        c.setFailureCount(0);
        c.setAverageScore(SimpleScore.valueOfInitialized(-300));
        SingleBenchmarkResult d = new SingleBenchmarkResult(mock(SolverBenchmarkResult.class), mock(ProblemBenchmarkResult.class));
        d.setFailureCount(0);
        d.setAverageScore(SimpleScore.valueOfInitialized(-20));
        assertCompareToOrder(comparator, a, b, c, d);
    }

}
