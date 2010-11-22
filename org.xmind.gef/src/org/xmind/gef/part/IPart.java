/* ******************************************************************************
 * Copyright (c) 2006-2010 XMind Ltd. and others.
 * 
 * This file is a part of XMind 3. XMind releases 3 and
 * above are dual-licensed under the Eclipse Public License (EPL),
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 * and the GNU Lesser General Public License (LGPL), 
 * which is available at http://www.gnu.org/licenses/lgpl.html
 * See http://www.xmind.net/license.html for details.
 * 
 * Contributors:
 *     XMind Ltd. - initial API and implementation
 *******************************************************************************/
package org.xmind.gef.part;

import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.xmind.gef.Request;

/**
 * @author Brian Sun
 * @version 2005
 */
public interface IPart extends IAdaptable {

    Object getModel();

    void setModel(Object model);

    IPart getParent();

    void setParent(IPart parent);

    List<IPart> getChildren();

    void addPartListener(IPartListener listener);

    void removePartListener(IPartListener listener);

    IPartSite getSite();

    IPartStatus getStatus();

    void addNotify();

    void removeNotify();

    void refresh();

    void update();

    boolean hasRole(String role);

    void handleRequest(Request request, String role);

}