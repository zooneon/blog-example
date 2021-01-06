//
//  RealLifeEx.swift
//
//  Created by 권준원 on 2021/01/07.
//
// 실생활 예제

protocol PrepareParty: class {
    func prepareFood()
    func prepareSong()
}

class PartyDirector {
    weak var delegate: PrepareParty?
    
    func order() {
        self.delegate?.prepareFood()
        self.delegate?.prepareSong()
    }
}

class FirstPartyWorker: PrepareParty {
    init(director: PartyDirector) {
        director.delegate = self
    }
    
    func prepareFood() {
        print("First worker prepared pizza")
    }
    
    func prepareSong() {
        print("First worker prepared BTS - Dynamite")
    }
    
}

class SecondPartyWorker: PrepareParty {
    init(director: PartyDirector) {
        director.delegate = self
    }
    
    func prepareFood() {
        print("Second worker prepared sushi")
    }
    
    func prepareSong() {
        print("Second worker prepared keshi - always")
    }
}

let zooneon = PartyDirector()

let son = FirstPartyWorker(director: zooneon)
zooneon.order()
//First worker prepared pizza
//First worker prepared BTS - Dynamite

let cho = SecondPartyWorker(director: zooneon)
zooneon.order()
//Second worker prepared sushi
//Second worker prepared keshi - always
