/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.linking;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public interface ILinker {

	/**
	 * Sets cross references in the passed {@link EObject} and its {@link EObject#eAllContents() contents},
	 * using the information available (usually using the {@link INode} model associated via {@link NodeModelUtils})
	 * 
	 * @param model the root model of a resource
	 * @param diagnosticsConsumer the consumer of linking diagnostics
	 */
	void linkModel(EObject model, IDiagnosticConsumer diagnosticsConsumer);

}
