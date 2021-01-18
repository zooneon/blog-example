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

    @IBOutlet weak var tableView: UITableView!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        tableView.dataSource = self
        tableView.delegate = self
    }
    
    let users: [User] = [
        User(name: "zooneon", age: 25, job: "student"),
        User(name: "sangjun", age: 25, job: "actor"),
        User(name: "minsu", age: 24, job: "developer"),
        User(name: "jiwon", age: 26, job: "artist")
    ]
}

extension UserListViewController: UITableViewDataSource {
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return users.count
    }
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        guard let cell = tableView.dequeueReusableCell(withIdentifier: "UserCell", for: indexPath) as? UserCell else {
            return UITableViewCell()
        }
        
        cell.nameLabel.text = users[indexPath.row].name
        cell.ageLabel.text = "(\(users[indexPath.row].age))"
        cell.jobLabel.text = users[indexPath.row].job
        
        return cell
    }
}

extension UserListViewController: UITableViewDelegate {
    func tableView(_ tableView: UITableView, heightForRowAt indexPath: IndexPath) -> CGFloat {
        return CGFloat(100)
    }
}
