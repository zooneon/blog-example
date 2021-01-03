//
//  SecondViewController.swift
//  DelegatePatternEx
//
//  Created by 권준원 on 2021/01/03.
//

import UIKit

protocol ChangeTextDelegate {
    func changeText()
}

class SecondViewController: UIViewController {
    
    var delegate: ChangeTextDelegate?
    
    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }
    
    @IBAction func clickButtonTapped(_ sender: UIButton) {
        self.delegate?.changeText()
        self.dismiss(animated: true, completion: nil)
    }
}
