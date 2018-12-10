/*
 * Copyright (C) 2016 Centre for Computational Geography, University of Leeds.
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
package uk.ac.leeds.ccg.andyt.chart.execution;

import java.beans.PropertyChangeEvent;

/**
 *
 * @author Andy Turner
 */
public class Generic_PropertyChangedListenerImpl implements Generic_PropertyChangedListener {
    
    boolean renderingComplete;
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void renderingComplete(Generic_PropertyChangedListener e) {
        renderingComplete = true;
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
