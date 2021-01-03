//
//  SecondViewController.swift
//  DelegatePatternEx
//
//  Created by 권준원 on 2021/01/03.
//

import UIKit

protocol ChangeUIDelegate {
    func changeUI()
}

class SecondViewController: UIViewController {
    
    var delegate: ChangeUIDelegate?
    
    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }
    
    @IBAction func clickButtonTapped(_ sender: UIButton) {
        self.delegate?.changeUI()
        self.dismiss(animated: true, completion: nil)
    }
}
