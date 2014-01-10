/*
 * Copyright 2012 JBoss Inc
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

package org.optaplanner.benchmark.impl.statistic;

import java.io.File;

import org.optaplanner.benchmark.impl.SingleBenchmarkResult;
import org.optaplanner.core.api.solver.Solver;

/**
 * 1 statistic of {@link SingleBenchmarkResult}
 */
public interface SingleStatistic {

    /**
     * @param solver never null
     */
    void open(Solver solver);

    /**
     * @param solver never null
     */
    void close(Solver solver);

    void writeCsvStatisticFile();

    /**
     * @return never null
     */
    File getCsvFile();

}