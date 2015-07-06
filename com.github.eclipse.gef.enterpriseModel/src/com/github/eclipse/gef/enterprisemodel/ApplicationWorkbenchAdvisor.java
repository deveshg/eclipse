package com.github.eclipse.gef.enterprisemodel;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import com.github.eclipse.gef.example.editor.MyEditor;
import com.github.eclipse.gef.example.editor.MyEditorInput;

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

	private static final String PERSPECTIVE_ID = "com.github.eclipse.gef.enterpriseModel.perspective"; //$NON-NLS-1$

	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(
			IWorkbenchWindowConfigurer configurer) {
		return new ApplicationWorkbenchWindowAdvisor(configurer);
	}

	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}

	@Override
	public void postStartup() {

		Display.getDefault().asyncExec(new Runnable() {
			
			@Override
			public void run() {
				openEditor();
			}
		});
		
	}

	private void openEditor() {
		try {

			IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow();

			if (activeWorkbenchWindow == null) {
				System.err.println("IWorkbenchWindow is null!");
				return;
			}

			IWorkbenchPage page = activeWorkbenchWindow.getActivePage();

			if (page == null) {
				System.err.println("IWorkbenchPage is null!");
				return;
			}

			page.openEditor(new MyEditorInput("TutoGEF"), MyEditor.EDITOR_ID(),
					false);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
