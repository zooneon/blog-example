// 실생활 예제

protocol PrepareParty {
    func prepareFood(_ foodName: String)
    func prepareSong(_ songName: String)
}

class PartyDirector {
    var delegate: PrepareParty?
    
    func order(foodName: String, songName: String) {
        self.delegate?.prepareFood(foodName)
        self.delegate?.prepareSong(songName)
    }
}

struct PartyWorker: PrepareParty {
    init(director: PartyDirector) {
        director.delegate = self
    }
    
    func prepareFood(_ foodName: String) {
        print("I prepared food which name is \(foodName)")
    }
    
    func prepareSong(_ songName: String) {
        print("I prepared song which name is \(songName)")
    }
    
}

let director = PartyDirector()
let worker = PartyWorker(director: director)

director.order(foodName: "곱창", songName: "테스형")

//I prepared food which name is 곱창
//I prepared song which name is 테스형
