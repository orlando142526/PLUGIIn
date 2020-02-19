/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.helloyou;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Bugtracking",
        id = "org.myorg.helloyou.HelloAction"
)
@ActionRegistration(
        iconBase = "org/myorg/helloyou/iconfinder_Black_pin_132608.png",
        displayName = "#CTL_HelloAction"
)
@ActionReference(path = "Toolbars/Build", position = 500)
@Messages("CTL_HelloAction=Hello You")
public final class HelloAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
        NotifyDescriptor.InputLine question;
    question = new NotifyDescriptor.InputLine("Name:",
        "What's your name?",
        NotifyDescriptor.OK_CANCEL_OPTION,
        NotifyDescriptor.QUESTION_MESSAGE);
 
    if (DialogDisplayer.getDefault().notify(question) == NotifyDescriptor.OK_OPTION) {
         String msg = "Hello "+question.getInputText()+"!";
         int msgType = NotifyDescriptor.INFORMATION_MESSAGE;
         NotifyDescriptor d = new NotifyDescriptor.Message(msg, msgType);
         DialogDisplayer.getDefault().notify(d);
    }
    }
}
