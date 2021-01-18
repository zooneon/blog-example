//
//  ViewController.swift
//  MVCPatternEx
//
//  Created by 권준원 on 2021/01/17.
//

import UIKit

class UserCell: UITableViewCell {
    @IBOutlet weak var nameLabel: UILabel!
    @IBOutlet weak var ageLabel: UILabel!
    @IBOutlet weak var jobLabel: UILabel!
}

class UserListViewController: UIViewController {

    @IBOutlet weak var tabelView: UITableView!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
    }
}
