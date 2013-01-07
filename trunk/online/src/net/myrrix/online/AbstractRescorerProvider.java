/*
 * Copyright Myrrix Ltd
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

package net.myrrix.online;

import org.apache.mahout.cf.taste.recommender.IDRescorer;
import org.apache.mahout.cf.taste.recommender.Rescorer;
import org.apache.mahout.common.LongPair;

import net.myrrix.common.MyrrixRecommender;

/**
 * Abstract implementation of {@link RescorerProvider} which implements all methods to return {@code null}.
 *
 * @author Sean Owen
 */
public abstract class AbstractRescorerProvider implements RescorerProvider {

  /**
   * @return {@code null}
   */
  @Override
  public IDRescorer getRecommendRescorer(long[] userIDs, MyrrixRecommender recommender, String... args) {
    return null;
  }

  /**
   * @return {@link #getRecommendRescorer(long[], MyrrixRecommender, String...)}
   */
  @Override
  @Deprecated
  public IDRescorer getRecommendRescorer(long[] userIDs, String... args) {
    return getRecommendRescorer(userIDs, null, args);
  }

  /**
   * @return {@code null}
   */
  @Override
  public IDRescorer getRecommendToAnonymousRescorer(long[] itemIDs, MyrrixRecommender recommender, String... args) {
    return null;
  }

  /**
   * @return {@link #getRecommendToAnonymousRescorer(long[], MyrrixRecommender, String...)}
   */
  @Override
  @Deprecated
  public IDRescorer getRecommendToAnonymousRescorer(long[] itemIDs, String... args) {
    return getRecommendToAnonymousRescorer(itemIDs, null, args);
  }

  /**
   * @return {@code null}
   */
  @Override
  public Rescorer<LongPair> getMostSimilarItemsRescorer(MyrrixRecommender recommender, String... args) {
    return null;
  }

  /**
   * @return {@link #getMostSimilarItemsRescorer(MyrrixRecommender, String...)}
   */
  @Override
  @Deprecated
  public Rescorer<LongPair> getMostSimilarItemsRescorer(String... args) {
    return getMostSimilarItemsRescorer(null, args);
  }

}
