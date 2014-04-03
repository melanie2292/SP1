class Match < ActiveRecord::Base
  belongs_to :local_team_id
  belongs_to :visitor_team_id
  belongs_to :winer_id
  belongs_to :loser_id
  belongs_to :group_id
  belongs_to :stadium_id
end
