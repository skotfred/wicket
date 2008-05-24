/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.wicket.markup.html.form;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.panel.FeedbackPanel;

/**
 * @author dashorst
 */
public class LocalizedMessagePage extends WebPage<Void>
{
	/** */
	private static final long serialVersionUID = 1L;

	public Form form;
	public TextField integerField;
	public FeedbackPanel feedback;

	public LocalizedMessagePage()
	{
		add(form = new Form("form"));
		form.add(integerField = new TextField("integer", Integer.class));
		form.add(feedback = new FeedbackPanel("feedback"));
	}
}
